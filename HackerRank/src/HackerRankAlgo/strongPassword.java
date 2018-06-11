package HackerRankAlgo;

import java.util.Scanner;

public class strongPassword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		String s;
		Scanner sc = new Scanner(System.in);
//		System.out.println("enter length of string");
		n = sc.nextInt();
//		System.out.println("Enter string");
		s = sc.next();
		

		boolean up = false;
		boolean lower = false;
		boolean special = false;
		boolean digit = false;
		boolean length = false;

		if (n < 6 ) {
			
			length = false;
		} else {
			length = true;
		}
			for (int i = 0; i < s.length(); i++) {
				char x = s.charAt(i);
				if (x >= 'a' && x <= 'z') {
					lower = true;
				} else if (x >= 'A' && x <= 'Z') {
					up = true;

				} else if (x >= '0' && x <= '9') {
					digit = true;
				} else if (x == '!' || x == '@' || x == '#' || x == '%' || x == '^' || x == '&' || x == '*' || x == '('
						|| x == ')' || x == '-' || x == '+') {
					special = true;

				}
			}
		
	
			
			if(length==false&&lower == true && special == false && digit == false && up == false)
			{
				int count =3;
				System.out.println(Math.max(count, 6-n));
			}
			 else if (length==false && lower==true && special == false && digit == false && up == true) {
				 System.out.println(Math.max(2, 6-n));

				} else if (length==false && lower==true && special == false && digit == true && up == false) {
					System.out.println(Math.max(2, 6-n));

				} else if (length==false && lower==true && special == false && digit == true && up == true) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && lower==true && special == true && digit == false && up == false) {
					System.out.println(Math.max(2, 6-n));

				} else if (length==false && lower==true && special == true && digit == false && up == true) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && lower==true && special == true && digit == true && up == false) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && lower==true && special == true && digit == true && up == true) {
					System.out.println(Math.max(0, 6-n));

				}
			
				else if (length==false && up == true && special == false && digit == false && lower == false) {
					System.out.println(Math.max(3, 6-n));
				} else if (length==false && up == true && special == false && digit == false && lower == true) {
					System.out.println(Math.max(2, 6-n));

				} else if (length==false && up == true && special == false && digit == true && lower == false) {
					System.out.println(Math.max(2, 6-n));

				} else if (length==false && up == true && special == false && digit == true && lower == true) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && up == true && special == true && digit == false && lower == false) {
					System.out.println(Math.max(2, 6-n));

				} else if (length==false && up == true && special == true && digit == false && lower == true) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && up == true && special == true && digit == true && lower == false) {
					System.out.println(Math.max(1, 6-n));

				} else if (length==false && up == true && special == true && digit == true && lower == true) {
					System.out.println(Math.max(0, 6-n));

				}
			
				 else if (length==false && special == true && up == false && digit == false && lower == false) {
					 System.out.println(Math.max(3, 6-n));
					} else if (length==false && special == true && up == false && digit == false && lower == true) {
						System.out.println(Math.max(2, 6-n));

					} else if (length==false && special == true && up == false && digit == true && lower == false) {
						System.out.println(Math.max(2, 6-n));

					} else if (length==false && special == true && up == false && digit == true && lower == true) {
						System.out.println(Math.max(1, 6-n));

					} else if (length==false && special == true && up == true && digit == false && lower == false) {
						System.out.println(Math.max(2, 6-n));

					} else if (length==false && special == true && up == true && digit == false && lower == true) {
						System.out.println(Math.max(1, 6-n));

					} else if (length==false && special == true && up == true && digit == true && lower == false) {
						System.out.println(Math.max(1, 6-n));

					} else if (length==false && special == true && up == true && digit == true && lower == true) {
						System.out.println(Math.max(0, 6-n));

					}
			
					 else if (length==false && digit == true && up == false && special == false && lower == false) {
						 System.out.println(Math.max(3, 6-n));
						} else if (length==false && digit == true && up == false && special == false && lower == true) {
							System.out.println(Math.max(2, 6-n));

						} else if (length==false && digit == true && up == false && special == true && lower == false) {
							System.out.println(Math.max(2, 6-n));

						} else if (length==false && digit == true && up == false && special == true && lower == true) {
							System.out.println(Math.max(1, 6-n));

						} else if (length==false && digit == true && up == true && special == false && lower == false) {
							System.out.println(Math.max(2, 6-n));

						} else if (length==false && digit == true && up == true && special == false && lower == true) {
							System.out.println(Math.max(1, 6-n));

						} else if (length==false && digit == true && up == true && special == true && lower == false) {
							System.out.println(Math.max(1, 6-n));

						} else if (length==false && digit == true && up == true && special == true && lower == true) {
							System.out.println(Math.max(0, 6-n));

						}

			
				
				
				
			if (length == true) {
				if (lower == true && special == false && digit == false && up == false) {
					System.out.println(Math.max(3, 6-n));
				} else if (lower == true && special == false && digit == false && up == true) {
					System.out.println(2);

				} else if (lower == true && special == false && digit == true && up == false) {
					System.out.println(2);

				} else if (lower == true && special == false && digit == true && up == true) {
					System.out.println(1);

				} else if (lower == true && special == true && digit == false && up == false) {
					System.out.println(2);

				} else if (lower == true && special == true && digit == false && up == true) {
					System.out.println(1);

				} else if (lower == true && special == true && digit == true && up == false) {
					System.out.println(1);

				} else if (lower == true && special == true && digit == true && up == true) {
					System.out.println(0);

				} else if (up == true && special == false && digit == false && lower == false) {
					System.out.println(3);
				} else if (up == true && special == false && digit == false && lower == true) {
					System.out.println(2);

				} else if (up == true && special == false && digit == true && lower == false) {
					System.out.println(2);

				} else if (up == true && special == false && digit == true && lower == true) {
					System.out.println(1);

				} else if (up == true && special == true && digit == false && lower == false) {
					System.out.println(2);

				} else if (up == true && special == true && digit == false && lower == true) {
					System.out.println(1);

				} else if (up == true && special == true && digit == true && lower == false) {
					System.out.println(1);

				} else if (up == true && special == true && digit == true && lower == true) {
					System.out.println(0);

				} else if (special == true && up == false && digit == false && lower == false) {
					System.out.println(3);
				} else if (special == true && up == false && digit == false && lower == true) {
					System.out.println(2);

				} else if (special == true && up == false && digit == true && lower == false) {
					System.out.println(2);

				} else if (special == true && up == false && digit == true && lower == true) {
					System.out.println(1);

				} else if (special == true && up == true && digit == false && lower == false) {
					System.out.println(2);

				} else if (special == true && up == true && digit == false && lower == true) {
					System.out.println(1);

				} else if (special == true && up == true && digit == true && lower == false) {
					System.out.println(1);

				} else if (special == true && up == true && digit == true && lower == true) {
					System.out.println(0);

				} else if (digit == true && up == false && special == false && lower == false) {
					System.out.println(3);
				} else if (digit == true && up == false && special == false && lower == true) {
					System.out.println(2);

				} else if (digit == true && up == false && special == true && lower == false) {
					System.out.println(2);

				} else if (digit == true && up == false && special == true && lower == true) {
					System.out.println(1);

				} else if (digit == true && up == true && special == false && lower == false) {
					System.out.println(2);

				} else if (digit == true && up == true && special == false && lower == true) {
					System.out.println(1);

				} else if (digit == true && up == true && special == true && lower == false) {
					System.out.println(1);

				} else if (digit == true && up == true && special == true && lower == true) {
					System.out.println(0);

				}
			}
		}

	}


