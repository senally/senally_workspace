/**
 * 
 */
package com.senally;

/**
 * @author fujisawa
 *
 */
public class JavaSort {

	/**
	 * @param args
	 */
public static void main(String[] args){
		if(args.length != 1){
			//���������͂���Ȃ������ꍇ�̃G���[���b�Z�[�W
			System.out.println("��������͂��ĉ������B�����ɕ��ёւ���ꍇ��0�A"
					+ "�~���ɕ��ёւ���ꍇ��1�B");
			return;
		}
		
		//�����_���Ȑ����T���i�[����z��
		int[] intArray = {36, 7, 12, 28, 0, 99, 17, 41, 5};
		
		//�R�}���h���C��������	1�Ԗڂ�order�ɑ��
		int order = Integer.parseInt(args[0]);
		
		if(order > 1){
			//0�܂���1�ȊO�̐������͂��ꂽ�ꍇ�̃G���[���b�Z�[�W
			System.out.println("�����ɕ��ёւ���ꍇ��0�A"
					+ "�~���ɕ��ёւ���ꍇ��1�B����ȊO�̐����͓��͏o���܂���");
			return;
		}
		
		//�߂�l���󂯂邽�߂̕ϐ�
		int[] ansArray;
		
		//NumberOrder�̃C���X�^���X�������܂�
		OrderFunction orderF = new OrderFunction();
		
		//ansArray�Ƀ��\�b�hsort�̖߂�l����
		ansArray= orderF.chooseOrder(intArray,order);
		
		System.out.println("��������ёւ��܂��F");
		for(int i=0;i<ansArray.length;i++){
			//�������i�[���ꂽnewArray��\�����܂�
			System.out.println(ansArray[i]);
		}
	}

}
