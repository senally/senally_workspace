/**
 * 
 */
package com.senally;

/**
 * int�z����\�[�g����N���X�ł�
 * 
 * @author fujisawa
 * @version 1.0.0
 */
public class NumberOrder {
	
	/**
	 * �������ɂ���đ������̔z��������܂��͍~���ɕ��ёւ���t�B�N�V�����ł�
	 * 
	 * @param sortArray �\�[�g�Ώۂ̔z��
	 * @param sortOrder 0:����,1:�~���Ƀ\�[�g���܂�
	 * 
	 * @return�@�\�[�g�����z��@�@sortOrder��0��1�ȊO�̏ꍇ�́Anull�����̂܂ܕԂ��܂�
	 */
	public int[] chooseOrder(int[] sortArray, int sortOrder){
		
		///////////////////////////////////////
//		if(sortOrder==0){
//			//����
//			return orderAsc(sortArray);
//		}else if(sortOrder==1){
//			//�~��
//			return orderDesc(sortArray);
//		}
//		return sortArray;
		///////////////////////////////////////
		
		//��������0��������ꂽ�ꍇ
		if(sortOrder==0){
			
			//�������琔�����i�[���邽�߂̔z��
			int[] upArray =  new int[sortArray.length];
			
			//sortArray�z�񐔂�while����0����J�E���g���Ă����ϐ�
			int numbers=0;
			
			//while�����V�����z�񐔂��J�E���g���A�����ɐV�����z��̊i�[�̍ۂ�
			//�i�[���ƂȂ���0����J�E���g���Ă����ϐ�
			int cat= 0;
			
			//intArray�z�񐔂�cat���傫����while������葱����
			while(cat<sortArray.length){
				//intArray[numbers]*���ڂ�8��cat*���ڂ�0���ꏏ�Ȃ�
				if(sortArray[numbers]==cat){
					//intArray[numbers]�̐��l��sortArray[cat]�֊i�[����
					upArray[cat] = sortArray[numbers];
					//cat���P�J�E���g����
					cat++;
				}
				
				//numbers���P�J�E���g����
				numbers++;
				//numbers��sortArray�z��10���傫���Ȃ����ꍇ��0�Ƀ��Z�b�g����
				if(numbers==sortArray.length){
					numbers=0;
				}
			}
			
			//upArrey�z���߂�l�Ƃ��ĕԂ��܂�
			return upArray;
			
			//sortOrder�ɂP�Ɠ��͂��ꂽ�ꍇ�̍~�����ёւ�
		}else{
			//�~�����琔�����i�[���邽�߂̔z��
			int[] downArray =  new int[sortArray.length];
			//sortArray�z�񐔂�while����0����J�E���g���Ă����ϐ�
			int numbers2=0;
			//while����9����J�E���g�_�E�����Ă����ϐ�
			int dog= 9;
			//sortArray�̔z�񐔃J�E���g�A�b�v����ϐ�
			int i = 0;
			
			//dog��0�ȏ�̊�while������葱����
			while(dog>=0){
				//sortArray[numbers]*���ڂ�8��dog*���ڂ�9���ꏏ�Ȃ�
				if(sortArray[numbers2]==dog){
					//sortArray[numbers2]�̐��l��downArray[i]�֊i�[����
					downArray[i] = sortArray[numbers2];
					//dog���P�J�E���g�_�E������
					dog--;
					//i���P�J�E���g�A�b�v����
					i++;
				}
				//numbers2���P�J�E���g����	
				numbers2++;
				//numbers2��sortArray�z��10���傫���Ȃ����ꍇ��0�Ƀ��Z�b�g����
				if(numbers2==sortArray.length){
					numbers2=0;
				}
			}
			//downArrey�z��i�~�����ёւ��j��߂�l�Ƃ��ĕԂ��܂�
			return downArray;
		}
	}
	
	/**
	 * 	�����Ń\�[�g
	 * @param array
	 * @return
	 */
	public int[] orderAsc(int[] array){
		int[] retArray =  new int[array.length];
		return retArray;
	}
	
	/**
	 * �~���Ń\�[�g
	 * @param array
	 * @return
	 */
	public int[] orderDesc(int[] array){
		int[] retArray =  new int[array.length];
		return retArray;
		
	}
}