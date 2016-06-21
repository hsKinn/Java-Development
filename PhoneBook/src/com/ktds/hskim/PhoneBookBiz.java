package com.ktds.hskim;

import java.util.ArrayList;
import java.util.List;

/**
 * 전화번호부 기능
 * 
 * Create : 생성
 * Read	  : 검색
 * Update : 수정
 * Delete : 삭제
 * ============
 * CRUD
 * 
 */
public class PhoneBookBiz {
	
	/**
	 * List 선언
	 */
	private List<PhoneInfoVO> phoneInfoList;
	
	/**
	 * 생성자로 List 초기화
	 */
	public PhoneBookBiz() {
		this.phoneInfoList = new ArrayList<PhoneInfoVO>();
	}
	
	public List<PhoneInfoVO> getPhoneInfoList() {
		return phoneInfoList;
	}
	public void setPhoneInfoList(List<PhoneInfoVO> phoneInfoList) {
		this.phoneInfoList = phoneInfoList;
	}

	/**
	 * 전화부 생성 
	 * PhoneInfoVO 파라미터로 가져와 add
	 * @param phoneInfo 
	 */
	public void addNewPhoneBookInfo ( PhoneInfoVO phoneInfo ) {
		this.phoneInfoList.add(phoneInfo);
	}
	
	/**
	 * 전화부 검색
	 */
	public PhoneInfoVO getPhoneInfoByName ( String name ) {
		
		// 이름으로 검색
		for (PhoneInfoVO phoneInfo : this.phoneInfoList ) {
			if ( phoneInfo.getName().equals(name) ) {
				return phoneInfo;
			}
		}
		
		//리스트 내 검색한 결과 없을 시 새로운 인스턴스 만들어 리턴
		return new PhoneInfoVO();
	}
	
}
