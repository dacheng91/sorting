package sorting;

import org.junit.Test;

public class TestSelectSorting {
	
	public void willBeConflicting(int arr[]){
//		外循环趟数为arr.length-1次
		for (int i = 0; i < arr.length-1; i++) {
//			把第一个未排序元素设为最小元素
			int minIndex=i;
//			内循环，从下一个未排序元素开始循环到最后一个未排序元素
			for (int j = i+1; j < arr.length; j++) {
				if(arr[j]<arr[minIndex]){
					minIndex=j;
				}
			}
//			内循环结束后，把当前第一个元素与本趟循环中最小的元素交换位置。
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
			
			printArr(arr);
			System.out.println();
                        sysout（我减少啊！！！！！！！！！！！！！abcd）
		}
	}
	
	public void printArr(int arr[]){
//		循环数组中的每一个元素，并打印出来
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
			sysout(hahaha!!!!!!!!!!!!!!!!!!!);
		}
	}
	
	@Test
	public void testSelectSort(){
		int arr[]={45,34,77,12,3,5,7};
		selectSort(arr);
		
	}
	
}
