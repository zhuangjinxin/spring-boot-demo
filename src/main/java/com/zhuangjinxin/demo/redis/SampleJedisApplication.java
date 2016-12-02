package com.zhuangjinxin.demo.redis;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import redis.clients.jedis.Jedis;

@SpringBootApplication
public class SampleJedisApplication {
	
	@PostConstruct
	public void doSomething(){
		Jedis jedis=new Jedis("120.27.48.62",6379);//建立连接
		jedis.auth("redis"); 
		
		System.out.println("-----Jedis增删改查-----");
		jedis.set("jedis", "jedis");//添加
		String value=jedis.get("jedis");
		System.out.println("jedis value:"+value);
		
		jedis.append("jedis", " is very strong");//拼接
		System.out.println("jedis value:"+jedis.get("jedis"));
		
		jedis.del("jedis");//删除
		System.out.println("jedis value:"+jedis.get("jedis"));
		
		jedis.mset("user.name","zhuangjinxin","user.age","19","user.gender","man");//多个键值队
		jedis.incr("user.age");//加1
		System.out.println("name:"+jedis.get("user.name")+",age="+jedis.get("user.age")+",gender="+jedis.get("user.gender"));
		
		System.out.println("-----Jedis操作Map-----");
		Map<String,String> user = new HashMap<String,String>();
		user.put("name", "zhuangjinxin");
		user.put("age", "20");
		user.put("gender", "man");
		jedis.hmset("user", user);
		List<String> list=jedis.hmget("user", "name","age","gender");
		System.out.println("Response:"+list);
		
		jedis.hdel("user", "gender");
		System.out.println(jedis.hmget("user", "gender"));
		System.out.println(jedis.hlen("user"));
		System.out.println(jedis.exists("user"));
		System.out.println("键：" + jedis.hkeys("user"));
		System.out.println("值：" + jedis.hvals("user"));
		
		Iterator<String> items = jedis.hkeys("user").iterator();
		while(items.hasNext()){
			String key = items.next();
			System.out.println(key+"="+jedis.hmget("user", key));
		}
		
		System.out.println("-----Jedis操作List-----");
		jedis.del("citys");
		System.out.println(jedis.lrange("citys", 0, -1));//从0到最后一个（包含）
		jedis.lpush("citys", "beijing");
		jedis.lpush("citys", "shanghai");
		jedis.lpush("citys", "guangzhou");
		jedis.lpush("citys", "shenzhen");
		System.out.println("jedis.lpush:"+jedis.lrange("citys", 0, -1));
		
		jedis.del("citys");
		jedis.rpush("citys", "beijing");
		jedis.rpush("citys", "shanghai");
		jedis.rpush("citys", "guangzhou");
		jedis.rpush("citys", "shenzhen");
		System.out.println("jedis.rpush:"+jedis.lrange("citys", 0, -1));
		
		System.out.println("-----Jedis操作Set-----");
		jedis.sadd("phone", "MI");//增加
		jedis.sadd("phone", "OPPO");
		jedis.sadd("phone", "APPLE");
		jedis.srem("phone", "APPLE");//删除
		System.out.println("members:"+jedis.smembers("phone"));//Return all the members
		System.out.println("is member:"+jedis.sismember("phone", "APPLE"));
		System.out.println("rand member:"+jedis.srandmember("phone"));//Return a random element
		System.out.println("Length:"+jedis.scard("phone"));//cardinality (number of elements)
		
		System.out.println("-----Jedis排序-----");
		jedis.del("sort");
		jedis.rpush("sort", "18");
		jedis.lpush("sort", "92");
		jedis.rpush("sort", "36");
		System.out.println("original:"+jedis.lrange("sort", 0, -1));
		System.out.println("sort:"+jedis.sort("sort"));
		System.out.println("after:"+jedis.lrange("sort",0,-1));
		
		// 测试Jedis连接池
		System.out.println("-----Jedis连接池-----");
		JedisPoolUtil.getJedis().set("JedisPool", "connect");
		System.out.println(JedisPoolUtil.getJedis().get("JedisPool"));
	}

	public static void main(String[] args) {
		SpringApplication.run(SampleJedisApplication.class, args);
	}

}
