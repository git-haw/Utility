package top.haw358.utils;

import org.apache.commons.lang.builder.ToStringBuilder;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Bean {
	private byte[] bt;
	private short shrt;
	private Integer intg;
	private Long lg;
	private Float flt;
	private Double dble;
	private char[] chr;
	private Character chrctr;
	private String str;
	private List<String> list;
	private Set<String> set;
	private Map<String, Object> map;

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	public Set<String> getSet() {
		return set;
	}

	public void setSet(Set<String> set) {
		this.set = set;
	}

	public Map<String, Object> getMap() {
		return map;
	}

	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	public byte[] getBt() {
		return bt;
	}
	public void setBt(byte[] bt) {
		this.bt = bt;
	}

	public short getShrt() {
		return shrt;
	}

	public void setShrt(short shrt) {
		this.shrt = shrt;
	}

	public Integer getIntg() {
		return intg;
	}

	public void setIntg(Integer intg) {
		this.intg = intg;
	}
	public Long getLg() {
		return lg;
	}
	public void setLg(Long lg) {
		this.lg = lg;
	}
	public Float getFlt() {
		return flt;
	}
	public void setFlt(Float flt) {
		this.flt = flt;
	}

	public Double getDble() {
		return dble;
	}

	public void setDble(Double dble) {
		this.dble = dble;
	}
	public char[] getChr() {
		return chr;
	}
	public void setChr(char[] chr) {
		this.chr = chr;
	}

	public Character getChrctr() {
		return chrctr;
	}

	public void setChrctr(Character chrctr) {
		this.chrctr = chrctr;
	}
	public String getStr() {
		return str;
	}
	public void setStr(String str) {
		this.str = str;
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
