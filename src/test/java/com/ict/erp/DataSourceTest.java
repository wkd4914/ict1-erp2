package com.ict.erp;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ict.erp.vo.LevelInfo;

@RunWith(SpringJUnit4ClassRunner.class)   // @RunWith JUnit 프레임워크의 테스트 실행 방법을 확장할 때 사용하는 애노테이션이다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired
	private DataSource ds;
	
	@Autowired
	private SqlSessionFactory ssf;
	
	@Autowired
	private SqlSession ss;
	
	
	@Test
	public void test() {
		try {
			Connection con = ds.getConnection();
			System.out.println("테스트 ㅇㅋ");
			} catch (SQLException e) {
			fail(e.getMessage());
		}
	}

	@Test
	public void ssfTest() {
		try(SqlSession ss = ssf.openSession()){
			System.out.println("Sql Session 생성 테스트 완료");
		}catch(Exception e) {
			fail(e.getMessage());
		}
	}
	
	@Test
	public void ssTest() {
		assertNotNull(ss);
		List<LevelInfo> liList = ss.selectList("sql.levelInfo.selectlevelInfo");
		assertEquals(liList.size(), 0);
	}
	
	@Test
	public void insertTest() {
		LevelInfo li = new LevelInfo();
		li.setLiLevel(1);
		li.setLiName("테스트");
		li.setLiDesc("테스트 데이터");
		assertEquals(ss.insert("sql.levelInfo.insertLevleInfo", li), 1);
	}
	
	/*@Test
	public void updateTest() {
		LevelInfo li = new LevelInfo();
		li.setLiNum(4);
		li.setLiLevel(1);
		li.setLiName("update테스트");
		li.setLiDesc("update 테스트 데이터");
		assertEquals(ss.insert("sql.levelInfo.updateLevelInfo", li), 1);
	}
	
	/*@Test
	public void deleteLevelInfo() {
		LevelInfo li = new LevelInfo();
		li.setLiNum(2);
		assertEquals(ss.insert("sql.levelInfo.deleteLevelInfo", li), 1);
	}



*/






	
	
	
}
