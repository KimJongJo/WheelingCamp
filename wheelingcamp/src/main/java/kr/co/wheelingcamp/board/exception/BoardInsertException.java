package kr.co.wheelingcamp.board.exception;

public class BoardInsertException extends RuntimeException {
	
	public BoardInsertException() {
		super("게시글 작성 중 예외 발생");
	}
	
	public BoardInsertException(String message) {
		super(message);
		
		
	}
}
