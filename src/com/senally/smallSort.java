package com.senally;

public class smallSort {
	public static void main(String[] args){
	int[] intArray={101, 103, 102};
	//�����_���Ȑ������\�ߊi�[���ꂽ�z��̐錾
	int newArray[] =new int[3];
	//�����ɐ������i�[���邽�߂̔z��̐錾
	int cat=0;
	int dog=0;
	//while���Aif���ŃJ�E���g�Ɏg�����߂̕ϐ�
	while(dog<intArray.length){
		//while(dog�̃J�E���g����intArray�z��̔z�񐔂ƈꏏ�ɂȂ�܂�)
		if(intArray[cat]-101==dog){
			//if(intArray[cat=���ڂ͂P�Ȃ̂�]=1��dog�Ɠ������l�Ȃ�)
			newArray[dog] = intArray[cat];
			//newArray[dog]���ڂ�0��intArray[cat]����101��}��
			dog++;
			//dog���P�J�E���g�i���ڂ�1�j
		}
		System.out.println("cat: "+cat+" dog: "+dog);
		//������ƕϐ����J�E���g����Ă��邩�m�F���邽�߂�println
		cat++;
		//cat���P�J�E���g�i���ڂ�1�j
		if(cat==3){
			cat=0;
		}
		//cat��intArray�z��Ԓn�ő吔2�𒴂��Ă��܂�����0�ɂ���
		//���Z�b�g���Ă���12�s�ڂɖ߂�
	}
	System.out.println("newSort: "+newArray[0]+newArray[1]+newArray[2]);
	//�V�����z���0���珇�ɕ\������
	}
}
