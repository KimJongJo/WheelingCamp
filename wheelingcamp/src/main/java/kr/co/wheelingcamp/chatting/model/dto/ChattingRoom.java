package kr.co.wheelingcamp.chatting.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class ChattingRoom {

	private int chattingNo;		// 채팅방 번호
	private String lastMessage; // 마지막 메세지
	private String sendTime;	// 마지막 메세지 보낸 시
	private int targetNo;		// 채팅방의 대상자 회원 번호	
	private String targetNickName;	// 채팅방의 대상자 닉네임
	private int notReadCount;		// 채팅방의 읽지 않은 메세지 개수
	private int openMember;
	
}
