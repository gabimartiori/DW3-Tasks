package fat_fibo;

public class Fatorial_fib {
	int fat(int n){

		if (n < 0){

			return -1;

		} else if (n == 0){

			return 1;

		} else {

			return n * fat(n - 1);

		}

	}

	

	int fibo(int n){

		if (n < 1){

			return -1;

		} else if (n == 1){

			return 0;

		} else if (n == 2){

			return 1;

		} else {

			int n1 = 0;

			int n2 = 1;

			int n3 = 1;

			n = n - 2;

			while (n > 0){

				n3 = n1 + n2;

				n1 = n2;

				n2 = n3;

				n--;

			}

			return n3;

		}

	}

}
