package com.parkingShare.vo;

import org.apache.ibatis.type.Alias;

@Alias("ChattingVO")
public class ChattingVO {

	private int messageIdx;			//�޼�����ȣ
	private int chatroomIdx;		//ä�ù��ȣ
	private int senderIdx;			//�߽���
	private int recipientsIdx;		//������
	private String messageText;		//����
	private String createdDate;		//������
	private String delYn;			//��������
	
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
