package org.wonseok.swing;

import javax.swing.JOptionPane;

public class DialogExam {
	
	public DialogExam() {
		// TODO Auto-generated constructor stub
	
		int res = JOptionPane.showOptionDialog
				(null, "원하는 작업을 선택하시오.", "대화상자", JOptionPane.YES_NO_CANCEL_OPTION, 
						JOptionPane.INFORMATION_MESSAGE, null, new String[]{"가입하기","다시쓰기","취소"}, "가입하기");
		
		
		
		
		System.out.println(res);
	}
	
	
	public void test2() {
		// TODO Auto-generated constructor stub
//		int result = JOptionPane.showConfirmDialog(this, "작업을 종료하시겠습니까?", result);
//		System.out.println(result);
//		if(result==0)
//		{
//			System.out.println("예");
//		}else if(result ==1)
//		{
//			System.out.println("아니오");
//		}else if(result ==2)
//		{
//			System.out.println("취소");
//		}
	}
	public void test() {
		// TODO Auto-generated constructor stub
//		JOptionPane.showMessageDialog(null, "일자리가 보장 되었습니다!");
		String inputMsg = JOptionPane.showInputDialog("아이디 입력: ");
		System.out.println(inputMsg);
		JOptionPane.showMessageDialog(null, inputMsg+"일자리가 보장 되었습니다!");
	}
	public static void main(String[] args) {
		
		new DialogExam();
	}
}
