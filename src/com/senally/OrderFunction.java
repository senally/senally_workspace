/**
 * 
 */
package com.senally;

/**
 * �������\�[�g����N���X�ł�
 * 
 * @author fujisawa
 * @since 1.0.0
 * 
 */
public class OrderFunction {
	
	/**
	 * �������󂯂āA�����܂��͍~���Ƀ\�[�g�����z���߂�l�Ƃ��ĕԂ��܂�
	 * 
	 * @param sortArray�@�\�[�g�ΏۂƂȂ�z��
	 * @param sortOrder�@0=�����@1=�~��
	 * @return �\�[�g���ꂽint�z��
	 * 
	 */
	public int[] chooseOrder(int[] sortArray, int sortOrder){
		if(sortOrder==0){
			//����
			return countUp(sortArray);
		}else if(sortOrder==1){
			//�~��
			return countDown(sortArray);
		}
		return sortArray;
	}
	
	/**
	 * �����Ƀ\�[�g���܂�
	 * 
	 * @param sortArray�@�\�[�g�ΏۂƂȂ�z��
	 * @return �����Ƀ\�[�g���ꂽ�z��
	 * 
	 */
	public int[] countUp(int[] sortArray){
		
		//��������sortArray�Ɋi�[���ꂽ�l���i�[���邽�߂̔z��
		int[] upArray =  new int[sortArray.length];
		
		//�ꎞ�I�ɍŏ��̒l�������邽�߂̕ϐ�
		int smallest;
		
		//�z��Y�����J�E���^�[
		//i��upArray�z��̓Y�������J�E���g���܂�
		int i = 0;
		//d��smallest�֑������l��sortArray�z�񂩂�o�͂���ۂɎg�p���܂�
		int d=0;
		
		//smallest��sortArray[i]�������܂�
		smallest = sortArray[i];
		
		//�ŏ��̒l��upArray[0]�֊i�[���܂�
		for(int v=0;v<sortArray.length;v++){
			if(smallest>sortArray[v])
				smallest = sortArray[v];
		}
		upArray[i] = smallest;
		i++;
		
		//��Ԗڂɏ������l����ő�̒l��upArray�z��֊i�[���܂�
		while(i<sortArray.length){
			//d�̒l��sortArray�z�񐔂��I�[�o�[���Ă����ꍇ0�Ƀ��Z�b�g���܂��B
			if(d<sortArray.length)
				d = 0;
			//smallest��sortArray[d]�������܂�
			smallest = sortArray[d];
			
			//������smallest�̒l��upArray�֊i�[�����Ō�̒l��菬�����܂��͓����ꍇ��
			//sortArray�z��̒�����upArray�z��Ɋi�[�����Ō�̒l���傫���Ȃ鑼�̒l��T���܂�
			while(smallest<=upArray[i-1]){
				if(d!=sortArray.length){
					d = d+1;
					smallest = sortArray[d];
				}else{
						d = 0;
						smallest = sortArray[d];
				}
			}
			
			//smallest��sortArray�Ɋi�[���ꂽ�S�Ă̐������r���܂�
			for(int r=0;r<sortArray.length;r++){
				//smallest��sortArray[r]���傫���A����sortArray[r]��upArray�֍Ō��
				//�i�[���ꂽ�������傫���ꍇ��smallest��sortArray[r]�̒l�������܂�
				if(smallest>sortArray[r]&&sortArray[r]>upArray[i-1])
					smallest = sortArray[r];
			}
			//upArray[i]��smallest�̒l���i�[���܂�
			upArray[i] = smallest;
			i++;
			d++;
		}
		//upArrey�z���߂�l�Ƃ��ĕԂ��܂�
		return upArray;
	}

	

	/**
	 * �~���Ƀ\�[�g���܂�
	 * 
	 * @param sortArray�@�\�[�g�ΏۂƂȂ�z��
	 * @return �~���Ƀ\�[�g���ꂽ�z��
	 * 
	 */
	public int[] countDown(int[] sortArray){
	
		//�~������sortArray�Ɋi�[���ꂽ�l���i�[���邽�߂̔z��
		int[] downArray =  new int[sortArray.length];
		
		//�ꎞ�I�ɍő�̒l�������邽�߂̕ϐ�
		int biggest;
		
		//�z��Y�����J�E���^�[
		//i��downArray�z��̓Y�������J�E���g���܂�
		int i = 0;
		//d��biggest�֑������l��sortArray�z�񂩂�o�͂���ۂɎg�p���܂�
		int d=0;
		
		//biggest��sortArray[i]�������܂�
		biggest = sortArray[i];
		
		//�ő�̒l��T���AdownArray[0]�֊i�[���܂�
		for(int v=0;v<sortArray.length;v++){
			if(biggest<sortArray[v])
				biggest = sortArray[v];
		}
		downArray[i] = biggest;
		i++;
		
		//��Ԗڂɑ傫���l����ŏ��̒l�܂ł�downArray�z��֊i�[���܂�
		while(i<sortArray.length){
			//d�̒l��sortArray�z�񐔂��I�[�o�[���Ă����ꍇ0�Ƀ��Z�b�g���܂��B
			if(d<sortArray.length)
				d = 0;
			//biggest��sortArray[d]�������܂�
			biggest = sortArray[d];
			
			//������biggest�̒l��downArray�֊i�[�����Ō�̒l���傫���܂��͓����ꍇ��
			//sortArray�z��̒�����upArray�z��Ɋi�[�����Ō�̒l��菬�������̒l��T���܂�
			while(biggest>=downArray[i-1]){
				if(d!=sortArray.length){
					d = d+1;
					biggest = sortArray[d];
				}else{
						d = 0;
						biggest = sortArray[d];
				}
			}
			
			//biggest��sortArray�Ɋi�[���ꂽ�S�Ă̐������r���܂�
			for(int r=0;r<sortArray.length;r++){
				//biggest��sortArray[r]���傫���A����sortArray[r]��downArray�֍Ō��
				//�i�[���ꂽ������菬�����ꍇ��biggest��sortArray[r]�̒l�������܂�
				if(biggest<sortArray[r]&&sortArray[r]<downArray[i-1])
					biggest = sortArray[r];
			}
			//downArray[i]��biggest�̒l���i�[���܂�
			downArray[i] = biggest;
			i++;
			d++;
		}
		//downArray�z���߂�l�Ƃ��ĕԂ��܂�
		return downArray;
	}
}
