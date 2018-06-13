package com.yao;

import com.yao.dao2.InterfaceMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;

/**
 * 襄州医院
 * @author myyf_09
 *
 */

@RunWith(SpringRunner.class)
@SpringBootTest
public class XZYYTest {
	
	@Autowired
	InterfaceMapper interDao;

	/**
	 * 1.获取大小科室接口
	 */
	@Test
	public void testDept(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("ReserverSource", "1");
		objmap.put("DeptOwn", "1");
		objmap.put("Pardep_Code", "");
		
		interDao.getDeptInfos(objmap);
		System.out.println(objmap);
	}

	/**
	 * 2、获取医生排班信息
	 */
	@Test
	public void testDeptSchedual(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("ReserverSource", "1");
		objmap.put("DeptOwn", "1");
		objmap.put("DepartCode", "0108");
		objmap.put("DepartName", "痔瘘科门诊");
		objmap.put("Registerdate", "2018-06-05");
		objmap.put("Location", "");
		objmap.put("Level", "");
		objmap.put("EXT1", "");
		objmap.put("EXT2", "");
		objmap.put("EXT3", "");
		
		interDao.getDeptScheduals(objmap);
		System.out.println(objmap);
	}

	/**
	 * 3.实时获取挂号号源
	 */
	@Test
	public void testClinicInfo(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("ReserverSource", "1");
		objmap.put("DeptOwn", "1");
		objmap.put("doctorNo", "");
		objmap.put("doctorName", "");
		objmap.put("doctorTitle", "");
		objmap.put("registerdate", "2018-06-08");
		objmap.put("specialty", "");
		objmap.put("deptCode", "0108");
		objmap.put("deptName", "痔瘘科门诊");
		objmap.put("timeInterval", "上午");
		objmap.put("EXT1", "");
		objmap.put("EXT2", "");
		objmap.put("EXT3", "");
		
		interDao.getClinicInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 4、预约挂号锁号和销号
	 */
	@Test
	public void testLockRecidInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("LockType", "1");
		objmap.put("ScheduleId", "痔瘘科急诊");
		objmap.put("PartTimeId", "2018-06-08");
		objmap.put("timeInterval", "上午");
		objmap.put("OrderNo", "sd1234567889");
		objmap.put("LockTime", "2018-06-08");
		objmap.put("PatientName", "王忠");
		objmap.put("IDCard", "331081199505061333");
		objmap.put("BirthDay", "1995-05-06");
		objmap.put("Sex", "1");
		objmap.put("Mobile", "18696206344");
		objmap.put("RecId", "");
		objmap.put("ReserverSource", "1");
		objmap.put("patientID", "M00000013");
		interDao.getLockRecidInfos(objmap);
		System.out.println(objmap);
	}

	/**
	 * 5.挂号确认支付并取号
	 */
	@Test
	public void testgetRecidInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("ScheduleId", "痔瘘科急诊");
		objmap.put("PartTimeId", "2018-06-08");
		objmap.put("timeInterval", "上午");
		objmap.put("OrderNo", "sd1234567811");
		objmap.put("patientID", "M00000013");
		objmap.put("IDCard", "331081199505061333");
		objmap.put("RecId", "5");
		objmap.put("Aoper", "2");
		objmap.put("TradeCode", "S1");
		objmap.put("tranType", "3");
		objmap.put("Amount", "4");
		objmap.put("TraceNum", "sd1234567811");
		objmap.put("TrDateTime", "2018-06-08");
		objmap.put("ReserverSource", "1");
		objmap.put("EXT1", "");
		objmap.put("EXT2", "");
		objmap.put("EXT3", "");
		objmap.put("EXT4", "");
		objmap.put("EXT5", "");
		interDao.getRecidInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 6.确认退号
	 */
	@Test
	public void testBackRecidInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("clinicCode", "2018060883658");
		objmap.put("operCode", "2");
		objmap.put("orgCode", "1");
		objmap.put("patientId", "M00000013");
		objmap.put("OrderNo", "sd1234567866");
		objmap.put("patientName", "王忠");
		objmap.put("amount", "4");
		objmap.put("RecId", "3");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		interDao.getBackidInfos(objmap);
		System.out.println(objmap);
	}

	/**
	 * 7、就诊卡查询
	 */
	@Test
	public void testCardInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("CardType", "2");
		objmap.put("CardNO", "331081199505061333");
		interDao.getCardInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 8、电子就诊卡建档
	 */
	@Test
	public void testCreateCardInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("CardType", "1");
		objmap.put("CardNO", "123456987");
		objmap.put("PatientName", "王中啊");
		objmap.put("IDCardNum", "331081199505061334");
		objmap.put("Gender", "1");
		objmap.put("Birthday", "1995-05-06");
		objmap.put("Address", "123123123");
		objmap.put("PhoneNum", "18696206344");
		objmap.put("Aoper", "2");
		objmap.put("Ext1", "");
		objmap.put("Ext2", "");
		objmap.put("Ext3", "");
		objmap.put("Ext4", "");
		interDao.getCreateCardInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 9、查询患者存在的诊间待缴费信息
	 */
	@Test
	public void testoutpordersInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("hospitalID", "1");
		objmap.put("sectionCode", "0101");
		objmap.put("patientId", "123456789");
		objmap.put("clinicCode", "2018053183581");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		interDao.getOutpOrdersCostInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 10、HIS确认诊间支付信息
	 */
	@Test
	public void testClinicPaymentInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("hospitalID", "1");
		objmap.put("patientId", "M00000013");
		objmap.put("clinicCode", "2018060883659");
		objmap.put("recipeNo", "2018060883659");
		objmap.put("TradeCode", "S1");
		objmap.put("tranType", "3");
		objmap.put("refNum", "2018060883659");
		objmap.put("amount", "200");
		objmap.put("operCode", "2");
		objmap.put("TrDateTime", "2018-06-08");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		interDao.getClinicPaymentInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 11、患者住院信息查询
	 */
	@Test
	public void testInppatientInfo(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("CardType", "3");
		objmap.put("inHospitalNo", "17004635");
		objmap.put("hospitalID", "1");
		objmap.put("idCode", "");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		interDao.getInppatientInfos(objmap);
		System.out.println(objmap);
	}

	/**
	 * 12、住院预缴接口
	 */
	@Test
	public void testInprecharge(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("CardType", "3");
		objmap.put("patientId", "17004635");
		objmap.put("tranType", "3");
		objmap.put("refNum", "sd1234567808");
		objmap.put("amount", "1000");
		objmap.put("operCode", "2");
		objmap.put("deptown", "1");
		objmap.put("TraceNum", "sd1234567808");
		objmap.put("TrDateTime", "2018-06-08");
		objmap.put("BankName", "");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		objmap.put("inPara6", "");
		interDao.getInprechargeInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 13、检验报告查询
	 */
	@Test
	public void testLabResultInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("hospitalID", "1");
		objmap.put("CardType", "3");
		objmap.put("patientId", "15013740");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		objmap.put("inPara6", "");
		interDao.getLabResultInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 14、检验报告查询
	 */
	@Test
	public void testExamResultInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("hospitalID", "1");
		objmap.put("CardType", "3");
		objmap.put("patientId", "15013740");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		objmap.put("inPara6", "");
		interDao.getExamResultInfos(objmap);
		System.out.println(objmap);
	}
	/**
	 * 15、病理报告查询
	 */
	@Test
	public void testPathologyResultInfos(){
		Map<String, String> objmap=new HashMap<>();
		objmap.put("hospitalID", "1");
		objmap.put("CardType", "3");
		objmap.put("patientId", "15013740");
		objmap.put("inPara1", "");
		objmap.put("inPara2", "");
		objmap.put("inPara3", "");
		objmap.put("inPara4", "");
		objmap.put("inPara5", "");
		objmap.put("inPara6", "");
		interDao.getPathologyResultInfos(objmap);
		System.out.println(objmap);
	}

	@Test
	public void testPathologyResultInfos111(){
		System.out.println("111111");
	}
}
