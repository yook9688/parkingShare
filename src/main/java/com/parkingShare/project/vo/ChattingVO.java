package com.parkingShare.project.vo;

import org.apache.ibatis.type.Alias;

@Alias("ChattingVO")
public class ChattingVO {

	private int messageIdx;			//메세지번호
	private int chatroomIdx;		//채팅방번호
	private int senderIdx;			//발신자
	private int recipientsIdx;		//수신자
	private String messageText;		//내용
	private String createdDate;		//생성일
	private String delYn;			//삭제유무
	
	public int getMessageIdx() {
		return messageIdx;
	}
	public void setMessageIdx(int messageIdx) {
		this.messageIdx = messageIdx;
	}
	public int getChatroomIdx() {
		return chatroomIdx;
	}
	public void setChatroomIdx(int chatroomIdx) {
		this.chatroomIdx = chatroomIdx;
	}
	public int getSenderIdx() {
		return senderIdx;
	}
	public void setSenderIdx(int senderIdx) {
		this.senderIdx = senderIdx;
	}
	public int getRecipientsIdx() {
		return recipientsIdx;
	}
	public void setRecipientsIdx(int recipientsIdx) {
		this.recipientsIdx = recipientsIdx;
	}
	public String getMessageText() {
		return messageText;
	}
	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}
	public String getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(String createdDate) {
		this.createdDate = createdDate;
	}
	public String getDelYn() {
		return delYn;
	}
	public void setDelYn(String delYn) {
		this.delYn = delYn;
	}
}
