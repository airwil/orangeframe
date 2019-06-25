package com.orangeframe.dubbo.provider.zkConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ZKStarter implements CommandLineRunner  {

	@Value("${embedded.zookeeper.port}")
	private int port;
	
	
	@Override
	public void run(String... args) throws Exception {
		new EmbeddedZooKeeper(port, false).start();
	}

}
