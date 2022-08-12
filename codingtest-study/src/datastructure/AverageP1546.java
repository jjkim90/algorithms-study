package datastructure;

import java.util.Scanner;

public class AverageP1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] scores = new int[N];
		for(int i=0; i<N; i++) {
			scores[i] = sc.nextInt();
		}
		int max = 0;
		int sum = 0;
		double avg = 0;
		for(int i=0; i<scores.length;i++) {
			if (max <= scores[i]) {
				max = scores[i];
			}
			sum += scores[i];
		}
		avg = (double)sum / max * 100.0 / N;
		System.out.println(avg);
	}
}
