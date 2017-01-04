package top.haw358.utils;

import java.util.*;


public class ConvertUtilTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bean bn = new Bean();
		byte[] b = new byte[1];
		b[0] = 1;
		bn.setBt(b);
		char[] chr = new char[1];
		chr[0] = 'b';
		bn.setChr(chr);
		bn.setChrctr(new Character('b'));
		bn.setDble(123D);
		bn.setFlt(456F);
		bn.setIntg(123456);
		bn.setLg(123456L);
		bn.setShrt((short) 100);
		bn.setStr("abc");
		List<String> list = new ArrayList<String>();
		list.add("abc");
		bn.setList(list);
		Set<String> set = new HashSet<String>();
		set.add("qwe");
		bn.setSet(set);
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("a", "asd");
		bn.setMap(map);

		Map<String, Object> data = ConvertUtil.beanToMap(bn);
		System.out.println(data);

		System.out.println(((byte[]) data.get("bt"))[0]);
		System.out.println(((char[]) data.get("chr"))[0]);
		System.out.println(((List) data.get("list")).get(0));
		System.out.println(((HashSet<String>) data.get("set")).iterator().next());
		System.out.println(((Map) data.get("map")).get("a"));

		Bean bn1 = new Bean();
		ConvertUtil.mapToBean(data,bn1);
		System.out.println(bn);
		System.out.println(bn1);

	}

}
