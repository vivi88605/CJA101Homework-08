package hw5;

import java.util.Arrays;

public class Homework5_5 {
//	身為程式設計師的你,收到一個任務,要幫系統的註冊新增驗證碼的功能,請設計一個方法genAuthCode(),
//	當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫與數字的亂數組合,如下:
//	本次隨機產生驗證碼為: GLSe3X81
	public static void main(String[] args) {
		System.out.println("本次隨機產生驗證碼為: " + genAuthCode());
	}

	public static String genAuthCode() {
		String charList = "abcdefghijklmnopqrstuvwxyz";
		String upperCaseCharList = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String numList = "0123456789";
		String[] combinedList = { charList, upperCaseCharList, numList };
		Object[] usedListIndex = new Object[8];
		String[] passWordList = new String[8];
//		先確認三種陣列都有被用到
		while (true) {
			for (int i = 0; i < usedListIndex.length; i++) {
				usedListIndex[i] = (int) (Math.random() * 3);
			}
			if (Arrays.asList(usedListIndex).contains(0) && Arrays.asList(usedListIndex).contains(1)
					&& Arrays.asList(usedListIndex).contains(2)) {
				break;
			}
		}

//		生成密碼
		for (int i = 0; i < 8; i++) {
//			判斷要從哪個陣列拿字元
			String temp = combinedList[(int) usedListIndex[i]];
//			字元加入密碼陣列
			passWordList[i] = String.valueOf(temp.charAt((int) (Math.random() * temp.length())));
		}
//		密碼陣列轉成字串
		return String.join("", passWordList);
	}

}