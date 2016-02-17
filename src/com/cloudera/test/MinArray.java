package com.cloudera.test;

public class MinArray{
	
int Solution(int a[], int b[],int M, int N){
	int temp = -1;
	for (int i = 0; i < M; i++) {
		for (int j = 0; j <N; j++) {
			if(a[i] == b[j]){
				if(temp == 0){
					temp = b[j];
				}
				else {
					if(temp > b[j]){
						temp = b[j];
					}
				}
			}
		}
	}
	return temp;
}
}


