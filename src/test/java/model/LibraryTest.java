package model;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Test;

import com.avaje.ebean.EbeanServer;
import com.avaje.ebean.EbeanServerFactory;
import com.avaje.ebean.config.DataSourceConfig;
import com.avaje.ebean.config.ServerConfig;

public class LibraryTest {
    @Test public void test() {
		ServerConfig config = new ServerConfig();
		config.setName("test");
		config.setDefaultServer(false);
		config.setRegister(true);
		
		DataSourceConfig postgresDb = new DataSourceConfig();
		postgresDb.setDriver("org.postgresql.Driver");
		postgresDb.setUsername("postgres");
		postgresDb.setPassword("");
		postgresDb.setUrl("jdbc:postgresql://127.0.0.1:5432/test");
		config.setDataSourceConfig(postgresDb);

		EbeanServer server = EbeanServerFactory.create(config); // throws exception
		
		Developer user1 = server.find(Developer.class, 1);
		Assert.assertThat(user1.getId(), equalTo(1));
    }
}
