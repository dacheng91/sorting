package sorting;

import org.junit.Test;

public class TestBubbleSort {
	
	// 冒泡排序思想：从右到左，两两比较，左边大于右边，则交换位置
	// 若有n个元素，进行n-1趟循环，第一趟循环进行n-1次比较，以后每趟逐级递减。若该趟循环中没有发生位置交换，跳出循环

	public void bubbleSort(int arr[], int n) {
		// 进行n-1趟循环
		for (int i = 0; i < n - 1; i++) {
			// 定义是否交换位置的标记
			boolean isSwap = false;
			// 最初n-1次比较，然后逐级递减，但是每次都要从第一个元素开始比较。
			for (int j = 0; j < n - 1-i; j++) {
				// 如果左边元素大于右边元素，那么交换元素位置，发生位置交换改变标记
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
					isSwap = true;
				}	
			}
			// 如果本趟循环没有发生位置交换，那么退出循环。
			sysout(貌似这样也不会发生冲突)


		}
	}

	public void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	@Test
	public void testBubbleSort(){
		int arr[]={23,45,13,44,67,2,5,7,15,1,99,88};
		bubbleSort(arr,12);
//		printArr(arr,12);
	}
}
