/**
 * 
 */
package com.senally;

/**
 * �z���\������t�@���N�V�����ł�
 * 
 * @author fujisawa
 *
 */
public class JavaBasic01 {	
	public static void main(String args[]){	
		
		//�����_���Ȑ���0~9�܂ł��i�[����z��
		int[] intArray = {8, 0, 6, 1, 3, 9, 4, 7, 2, 5};
		//�߂�l���󂯂邽�߂̕ϐ�
		int[] ansArray;
		//ansArray�Ƀ��\�b�hsort�̖߂�l����
		ansArray=sort(intArray);
		//�����ɐ������i�[���ꂽnewArray��\�����܂�
		System.out.println("�����������ɕ��ёւ��܂��F");
		for(int i=0;i<ansArray.length;i++){
			System.out.println(ansArray[i]);
		}
}
		
	/**
	 * �����_���Ȑ������i�[���ꂽ�z��������ɔz�񂷂�t�@���N�V�����ł�
	 * 
	 * @param sortArray
	 * @return 	 *
	 */	
	public static int[] sort(int sortArray[]){
		
		
		int[] retArray =  new int[sortArray.length];
		//�������琔�����i�[���邽�߂̔z��
		int numbers=0;
		//intArray�z�񐔂�while����0����J�E���g���Ă����ϐ�
		int cat= 0;
		/**
		 *while�����V�����z�񐔂��J�E���g���A�����ɐV�����z��̊i�[�̍ۂ�
		 *�i�[���ƂȂ���0����J�E���g���Ă����ϐ�
		 **/
		while(cat<sortArray.length){
			//intArray�z�񐔂�cat���傫����while������葱����
			if(sortArray[numbers]==cat){
				//intArray[numbers]*���ڂ�8��cat*���ڂ�0���ꏏ�Ȃ�
				retArray[cat] = sortArray[numbers];
				//intArray[numbers]�̐��l��retArray[cat]�֊i�[����
				cat++;
				//cat���P�J�E���g����
			}
			
			//System.out.println("numbers: "+numbers+" cat: "+cat);
			//�e�ϐ������m�ɃJ�E���g����Ă��邩�m�F���邽�߂̃R�[�h�ł�
				
			numbers++;
			//numbers���P�J�E���g����
			if(numbers==sortArray.length){
				numbers=0;
				//numbers��intArray�z��10���傫���Ȃ����ꍇ��0�Ƀ��Z�b�g����
		}
		}
		return retArray;
		//retArrey�z���߂�l�Ƃ��ĕԂ��܂�
	}
}