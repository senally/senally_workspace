/**
 * 
 */
package com.senally;

/**
 * �����_���Ɋi�[���ꂽ�����������Q�ɂ���āA�����܂��͍~����
 * ���ёւ���t�@���N�V�����ł�
 * 
 * @author fujisawa
 * @since 1.0.0
 * 
 */
public class JavaBasic02{
	public static void main(String[] args){
		
		
		if(args.length != 1){
			//���������͂���Ȃ������ꍇ�̃G���[���b�Z�[�W
			System.out.println("��������͂��ĉ������B�����ɕ��ёւ���ꍇ��0�A"
					+ "�~���ɕ��ёւ���ꍇ��1�B");
			return;
		}
		
		//�����_���Ȑ���0~9�܂ł��i�[����z��
		int[] intArray = {8, 0, 6, 1, 3, 9, 4, 7, 2, 5};
		
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
		NumberOrder numO = new NumberOrder();
		
		//ansArray�Ƀ��\�b�hsort�̖߂�l����
		ansArray= numO.chooseOrder(intArray,order);
		
		System.out.println("��������ёւ��܂��F");
		for(int i=0;i<ansArray.length;i++){
			//�������i�[���ꂽnewArray��\�����܂�
			System.out.println(ansArray[i]);
		}
	}
}