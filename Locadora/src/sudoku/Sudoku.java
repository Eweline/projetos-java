package sudoku;
 import java.awt.*;
 import java.awt.event.*;
 import javax.swing.*;

class Sudoku extends JFrame implements ActionListener
{
	JTextField T1;
	JButton B01,B02,B03,B11,B12,B13,B14,B15,B16,B17,B18,B19,B21,B22,B23,B24,B25,B26,B27,B28,B29,B31,B32,B33,B34,B35,B36,B37,B38,B39;
	JButton B41,B42,B43,B44,B45,B46,B47,B48,B49,B51,B52,B53,B54,B55,B56,B57,B58,B59,B61,B62,B63,B64,B65,B66,B67,B68,B69;
	JButton B71,B72,B73,B74,B75,B76,B77,B78,B79,B81,B82,B83,B84,B85,B86,B87,B88,B89,B91,B92,B93,B94,B95,B96,B97,B98,B99;
	int a=0,k,l,h=1,aux=0,i=0,Q1=0,Q2=0,Q3=0,Q4=0,Q5=0,Q6=0,Q7=0,Q8=0,Q9=0,L1=0,L2=0,L3=0,L4=0,L5=0,L6=0,L7=0,L8=0,L9=0,S1=0,S2=0,S3=0,S4=0,S5=0,S6=0,S7=0,S8=0,S9=0;
	int Matriz[][]=new int [9][9];
	public void kiko (String Args[])
	{
		for (int k=0;k<9;k++)
			for (int l=0;l<9;l++)
	  				{
		  				Matriz[k][l]=0;
  	   				}
	}
	public static void main(String Args[])
		{

			JFrame Janela=new Sudoku();
			Janela.show();
		}
	Sudoku()
		{
			setTitle("JOGO SUDOKU - Rodrigo Adriano Sant'Anna Lopes");
			setSize(420,340);
			setLocation(300,300);
			setResizable(false);
			getContentPane().setBackground(new Color(150,150,150));
			getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
			B11=new JButton(" ");
			B11.addActionListener(this);
			B12=new JButton(" ");B12.addActionListener(this);
			B13=new JButton(" ");B13.addActionListener(this);
			B14=new JButton(" ");B14.addActionListener(this);
			B15=new JButton(" ");B15.addActionListener(this);
			B16=new JButton(" ");B16.addActionListener(this);
			B17=new JButton(" ");B17.addActionListener(this);
			B18=new JButton(" ");B18.addActionListener(this);
			B19=new JButton(" ");B19.addActionListener(this);
			B21=new JButton(" ");B21.addActionListener(this);
			B22=new JButton(" ");B22.addActionListener(this);
			B23=new JButton(" ");B23.addActionListener(this);
			B24=new JButton(" ");B24.addActionListener(this);
			B25=new JButton(" ");B25.addActionListener(this);
			B26=new JButton(" ");B26.addActionListener(this);
			B27=new JButton(" ");B27.addActionListener(this);
			B28=new JButton(" ");B28.addActionListener(this);
			B29=new JButton(" ");B29.addActionListener(this);
			B31=new JButton(" ");B31.addActionListener(this);
			B32=new JButton(" ");B32.addActionListener(this);
			B33=new JButton(" ");B33.addActionListener(this);
			B34=new JButton(" ");B34.addActionListener(this);
			B35=new JButton(" ");B35.addActionListener(this);
			B36=new JButton(" ");B36.addActionListener(this);
			B37=new JButton(" ");B37.addActionListener(this);
			B38=new JButton(" ");B38.addActionListener(this);
			B39=new JButton(" ");B39.addActionListener(this);
			B41=new JButton(" ");B41.addActionListener(this);
			B42=new JButton(" ");B42.addActionListener(this);
			B43=new JButton(" ");B43.addActionListener(this);
			B44=new JButton(" ");B44.addActionListener(this);
			B45=new JButton(" ");B45.addActionListener(this);
			B46=new JButton(" ");B46.addActionListener(this);
			B47=new JButton(" ");B47.addActionListener(this);
			B48=new JButton(" ");B48.addActionListener(this);
			B49=new JButton(" ");B49.addActionListener(this);
			B51=new JButton(" ");B51.addActionListener(this);
			B52=new JButton(" ");B52.addActionListener(this);
			B53=new JButton(" ");B53.addActionListener(this);
			B54=new JButton(" ");B54.addActionListener(this);
			B55=new JButton(" ");B55.addActionListener(this);
			B56=new JButton(" ");B56.addActionListener(this);
			B57=new JButton(" ");B57.addActionListener(this);
			B58=new JButton(" ");B58.addActionListener(this);
			B59=new JButton(" ");B59.addActionListener(this);
			B61=new JButton(" ");B61.addActionListener(this);
			B62=new JButton(" ");B62.addActionListener(this);
			B63=new JButton(" ");B63.addActionListener(this);
			B64=new JButton(" ");B64.addActionListener(this);
			B65=new JButton(" ");B65.addActionListener(this);
			B66=new JButton(" ");B66.addActionListener(this);
			B67=new JButton(" ");B67.addActionListener(this);
			B68=new JButton(" ");B68.addActionListener(this);
			B69=new JButton(" ");B69.addActionListener(this);
			B71=new JButton(" ");B71.addActionListener(this);
			B72=new JButton(" ");B72.addActionListener(this);
			B73=new JButton(" ");B73.addActionListener(this);
			B74=new JButton(" ");B74.addActionListener(this);
			B75=new JButton(" ");B75.addActionListener(this);
			B76=new JButton(" ");B76.addActionListener(this);
			B77=new JButton(" ");B77.addActionListener(this);
			B78=new JButton(" ");B78.addActionListener(this);
			B79=new JButton(" ");B79.addActionListener(this);
			B81=new JButton(" ");B81.addActionListener(this);
			B82=new JButton(" ");B82.addActionListener(this);
			B83=new JButton(" ");B83.addActionListener(this);
			B84=new JButton(" ");B84.addActionListener(this);
			B85=new JButton(" ");B85.addActionListener(this);
			B86=new JButton(" ");B86.addActionListener(this);
			B87=new JButton(" ");B87.addActionListener(this);
			B88=new JButton(" ");B88.addActionListener(this);
			B89=new JButton(" ");B89.addActionListener(this);
			B91=new JButton(" ");B91.addActionListener(this);
			B92=new JButton(" ");B92.addActionListener(this);
			B93=new JButton(" ");B93.addActionListener(this);
			B94=new JButton(" ");B94.addActionListener(this);
			B95=new JButton(" ");B95.addActionListener(this);
			B96=new JButton(" ");B96.addActionListener(this);
			B97=new JButton(" ");B97.addActionListener(this);
			B98=new JButton(" ");B98.addActionListener(this);
			B99=new JButton(" ");B99.addActionListener(this);

			B01=new JButton("Iniciar  ");B01.addActionListener(this);
			B02=new JButton("Verificar");B02.addActionListener(this);
			B03=new JButton("Sair     ");B03.addActionListener(this);

			getContentPane().add(B11);
			getContentPane().add(B12);
			getContentPane().add(B13);
			getContentPane().add(B14);
			getContentPane().add(B15);
			getContentPane().add(B16);
			getContentPane().add(B17);
			getContentPane().add(B18);
			getContentPane().add(B19);
			getContentPane().add(B21);
			getContentPane().add(B22);
			getContentPane().add(B23);
			getContentPane().add(B24);
			getContentPane().add(B25);
			getContentPane().add(B26);
			getContentPane().add(B27);
			getContentPane().add(B28);
			getContentPane().add(B29);
			getContentPane().add(B31);
			getContentPane().add(B32);
			getContentPane().add(B33);
			getContentPane().add(B34);
			getContentPane().add(B35);
			getContentPane().add(B36);
			getContentPane().add(B37);
			getContentPane().add(B38);
			getContentPane().add(B39);
			getContentPane().add(B41);
			getContentPane().add(B42);
			getContentPane().add(B43);
			getContentPane().add(B44);
			getContentPane().add(B45);
			getContentPane().add(B46);
			getContentPane().add(B47);
			getContentPane().add(B48);
			getContentPane().add(B49);
			getContentPane().add(B51);
			getContentPane().add(B52);
			getContentPane().add(B53);
			getContentPane().add(B54);
			getContentPane().add(B55);
			getContentPane().add(B56);
			getContentPane().add(B57);
			getContentPane().add(B58);
			getContentPane().add(B59);
			getContentPane().add(B61);
			getContentPane().add(B62);
			getContentPane().add(B63);
			getContentPane().add(B64);
			getContentPane().add(B65);
			getContentPane().add(B66);
			getContentPane().add(B67);
			getContentPane().add(B68);
			getContentPane().add(B69);
			getContentPane().add(B71);
			getContentPane().add(B72);
			getContentPane().add(B73);
			getContentPane().add(B74);
			getContentPane().add(B75);
			getContentPane().add(B76);
			getContentPane().add(B77);
			getContentPane().add(B78);
			getContentPane().add(B79);
			getContentPane().add(B81);
			getContentPane().add(B82);
			getContentPane().add(B83);
			getContentPane().add(B84);
			getContentPane().add(B85);
			getContentPane().add(B86);
			getContentPane().add(B87);
			getContentPane().add(B88);
			getContentPane().add(B89);
			getContentPane().add(B91);
			getContentPane().add(B92);
			getContentPane().add(B93);
			getContentPane().add(B94);
			getContentPane().add(B95);
			getContentPane().add(B96);
			getContentPane().add(B97);
			getContentPane().add(B98);
			getContentPane().add(B99);
			getContentPane().add(B01);
			getContentPane().add(B02);
			getContentPane().add(B03);
		}
		public void actionPerformed (ActionEvent e)
				{
					if (e.getSource()==B01)
						{

							int Q1=0,Q2=0,Q3=0,Q4=0,Q5=0,Q6=0,Q7=0,Q8=0,Q9=0,L1=0,L2=0,L3=0,L4=0,L5=0,L6=0,L7=0,L8=0,L9=0,S1=0,S2=0,S3=0,S4=0,S5=0,S6=0,S7=0,S8=0,S9=0;
							if (i>9)
								i=1;
							for (int k=0;k<9;k++)
								for (int l=0;l<9;l++)
									Matriz[k][l]=0;

							Matriz[0][0]=7+i;Matriz[0][5]=8+i;Matriz[1][4]=2+i;Matriz[1][8]=3+i;Matriz[2][3]=3+i;Matriz[3][1]=8+i;Matriz[3][6]=3+i;Matriz[4][4]=6+i;Matriz[4][5]=2+i;Matriz[5][3]=8+i;
							Matriz[5][4]=4+i;Matriz[5][8]=6+i;Matriz[6][0]=1+i;Matriz[6][6]=4+i;Matriz[7][0]=3+i;Matriz[7][2]=4+i;Matriz[7][5]=9+i;Matriz[8][0]=5+i;Matriz[8][7]=8+i;Matriz[8][8]=9+i;

							int cont1 = 0,	cont2 = 0;
							for(int ver1 = 0;ver1<9;ver1++ )
								{
								for (int ver2 = 0; ver2<9; ver2++)
									{
									if (Matriz[ver1][ver2] > 9)
										{
											Matriz[ver1][ver2] = Matriz[ver1][ver2] - 9;
											cont1++;
											cont2++;
										}
									}
								}

							B11.setText(String.valueOf(Matriz[0][0]));B11.setBackground(Color.white);B11.setForeground(Color.red);
							B12.setText(" ");B12.setBackground(Color.white);
							B13.setText(" ");B13.setBackground(Color.white);
							B14.setText(" ");
							B15.setText(" ");
							B16.setText(String.valueOf(Matriz[0][5]));B16.setForeground(Color.red);
							B17.setText(" ");B17.setBackground(Color.white);
							B18.setText(" ");B18.setBackground(Color.white);
							B19.setText(" ");B19.setBackground(Color.white);
							B21.setText(" ");B21.setBackground(Color.white);
							B22.setText(" ");B22.setBackground(Color.white);
							B23.setText(" ");B23.setBackground(Color.white);
							B24.setText(" ");
							B25.setText(String.valueOf(Matriz[1][4]));B25.setForeground(Color.red);
							B26.setText(" ");
							B27.setText(" ");	B27.setBackground(Color.white);
							B28.setText(" ");	B28.setBackground(Color.white);
							B29.setText(String.valueOf(Matriz[1][8]));B29.setForeground(Color.red);
							B29.setBackground(Color.white);
							B31.setText(" ");	B31.setBackground(Color.white);
							B32.setText(" ");	B32.setBackground(Color.white);
							B33.setText(" ");	B33.setBackground(Color.white);
							B34.setText(String.valueOf(Matriz[2][3]));
							B34.setForeground(Color.red);
							B35.setText(" ");
							B36.setText(" ");
							B37.setText(" ");	B37.setBackground(Color.white);
							B38.setText(" ");	B38.setBackground(Color.white);
							B39.setText(" ");	B39.setBackground(Color.white);
							B41.setText(" ");
							B42.setText(String.valueOf(Matriz[3][1]));
							B42.setForeground(Color.red);
							B43.setText(" ");
							B44.setText(" ");	B44.setBackground(Color.white);
							B45.setText(" ");	B45.setBackground(Color.white);
							B46.setText(" ");	B46.setBackground(Color.white);
							B47.setText(String.valueOf(Matriz[3][6]));
							B47.setForeground(Color.red);
							B48.setText(" ");
							B49.setText(" ");
							B51.setText(" ");
							B52.setText(" ");
							B53.setText(" ");
							B54.setText(" ");		B54.setBackground(Color.white);
							B55.setText(String.valueOf(Matriz[4][4]));
							B55.setBackground(Color.white);
							B55.setForeground(Color.red);
							B56.setText(String.valueOf(Matriz[4][5]));
							B56.setBackground(Color.white);
							B56.setForeground(Color.red);
							B57.setText(" ");
							B58.setText(" ");
							B59.setText(" ");
							B61.setText(" ");
							B62.setText(" ");
							B63.setText(" ");
							B64.setText(String.valueOf(Matriz[5][3]));
							B64.setBackground(Color.white);
							B64.setForeground(Color.red);
							B65.setText(String.valueOf(Matriz[5][4]));
							B65.setBackground(Color.white);
							B65.setForeground(Color.red);
							B66.setText(" ");		B66.setBackground(Color.white);
							B67.setText(" ");
							B68.setText(" ");
							B69.setText(String.valueOf(Matriz[5][8]));
							B69.setForeground(Color.red);
							B71.setText(String.valueOf(Matriz[6][0]));
							B71.setForeground(Color.red);
							B71.setBackground(Color.white);
							B72.setText(" ");		B72.setBackground(Color.white);
							B73.setText(" ");		B73.setBackground(Color.white);
							B74.setText(" ");
							B75.setText(" ");
							B76.setText(" ");
							B77.setText(String.valueOf(Matriz[6][6]));
							B77.setBackground(Color.white);
							B77.setForeground(Color.red);
							B78.setText(" ");		B78.setBackground(Color.white);
							B79.setText(" ");		B79.setBackground(Color.white);
							B81.setText(String.valueOf(Matriz[7][0]));
							B81.setBackground(Color.white);
							B81.setForeground(Color.red);
							B82.setText(" ");		B82.setBackground(Color.white);
							B83.setText(String.valueOf(Matriz[7][2]));
							B83.setBackground(Color.white);
							B83.setForeground(Color.red);
							B84.setText(" ");
							B85.setText(" ");
							B86.setText(String.valueOf(Matriz[7][5]));
							B86.setForeground(Color.red);
							B87.setText(" ");		B87.setBackground(Color.white);
							B88.setText(" ");		B88.setBackground(Color.white);
							B89.setText(" ");		B89.setBackground(Color.white);
							B91.setText(String.valueOf(Matriz[8][0]));
							B91.setBackground(Color.white);
							B91.setForeground(Color.red);
							B92.setText(" ");		B92.setBackground(Color.white);
							B93.setText(" ");
							B93.setBackground(Color.white);
							B94.setText(" ");		B95.setText(" ");			B96.setText(" ");		B97.setText(" ");
							B97.setBackground(Color.white);
							B98.setText(String.valueOf(Matriz[8][7]));
							B98.setBackground(Color.white);
							B98.setForeground(Color.red);
							B99.setText(String.valueOf(Matriz[8][8]));
							B99.setBackground(Color.white);
							B99.setForeground(Color.red);
							i++;
  	   					}
  	   				if (e.getSource()==B02)
						{
							int Q1=0,Q2=0,Q3=0,Q4=0,Q5=0,Q6=0,Q7=0,Q8=0,Q9=0,L1=0,L2=0,L3=0,L4=0,L5=0,L6=0,L7=0,L8=0,L9=0,S1=0,S2=0,S3=0,S4=0,S5=0,S6=0,S7=0,S8=0,S9=0;
							for (int k=0;k<3;k++)
								for (int l=0;l<3;l++)
									Q1=Q1+Matriz[k][l];
							if (Q1!=45)
								{	JOptionPane.showMessageDialog(null,"Erro - Quadrante 1");
									aux=1;}

							for (int k=0;k<3;k++)
								for (int l=3;l<6;l++)
									Q2=Q2+Matriz[k][l];
							if (Q2!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 2");
								aux=1;}

							for (int k=0;k<3;k++)
								for (int l=6;l<9;l++)
									Q3=Q3+Matriz[k][l];
							if (Q3!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 3");
								aux=1;}

							for (int k=3;k<6;k++)
								for (int l=0;l<3;l++)
									Q4=Q4+Matriz[k][l];
							if (Q4!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 4");
								aux=1;}

							for (int k=3;k<6;k++)
								for (int l=3;l<6;l++)
									Q5=Q5+Matriz[k][l];
							if (Q5!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 5");
								aux=1;}

							for (int k=3;k<6;k++)
								for (int l=6;l<9;l++)
									Q6=Q6+Matriz[k][l];
							if (Q6!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 6");
								aux=1;}

							for (int k=6;k<9;k++)
								for (int l=0;l<3;l++)
									Q7=Q7+Matriz[k][l];
							if (Q7!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 7");
								aux=1;}

							for (int k=6;k<9;k++)
								for (int l=3;l<6;l++)
									Q8=Q8+Matriz[k][l];
							if (Q8!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 8");
								aux=1;}

							for (int k=6;k<9;k++)
								for (int l=6;l<9;l++)
									Q9=Q9+Matriz[k][l];
							if (Q9!=45)
								{JOptionPane.showMessageDialog(null,"Erro - Quadrante 9");
								aux=1;}

							if (aux==0)
								JOptionPane.showMessageDialog(null,"Parabéns,ganhou o Jogo");
							else
								JOptionPane.showMessageDialog(null,"Faça a Correção dos Erros ou Inicie um Novo Jogo");

						}
  	   				if (e.getSource()==B03)
						{
							System.exit(0);
  	   					}
					if (e.getSource()==B12)
						{
							a++;
							if (a>9)
							 a=1;			Matriz[0][1]=a;
							B12.setText(String.valueOf(a));			}
					 if (e.getSource()==B13)
						{
					 		a++;
							if (a>9)
					 		a=1;			Matriz[0][2]=a;
							B13.setText(String.valueOf(a));			}
					 if (e.getSource()==B14)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[0][3]=a;
						   B14.setText(String.valueOf(a));			}
					if (e.getSource()==B15)
						{
							a++;
							if (a>9)
							 a=1;			Matriz[0][4]=a;
							B15.setText(String.valueOf(a));			}
					if (e.getSource()==B17)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[0][6]=a;
					 		B17.setText(String.valueOf(a));			}
					 if (e.getSource()==B18)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[0][7]=a;
						   B18.setText(String.valueOf(a));			}
					if (e.getSource()==B19)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[0][8]=a;
						   	B19.setText(String.valueOf(a));			}
					if (e.getSource()==B21)
						{
							a++;
							if (a>9)
							a=1;			Matriz[1][0]=a;
							B21.setText(String.valueOf(a));			}
					if (e.getSource()==B22)
						{
							a++;
							if (a>9)
							 a=1;			Matriz[1][1]=a;
							B22.setText(String.valueOf(a));			}
					 if (e.getSource()==B23)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[1][2]=a;
					 		B23.setText(String.valueOf(a));			}
					 if (e.getSource()==B24)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[1][3]=a;
						   	B24.setText(String.valueOf(a));			}
					if (e.getSource()==B26)
						{
							a++;
							if (a>9)
							a=1;			Matriz[1][5]=a;
							B26.setText(String.valueOf(a));			}
					 if (e.getSource()==B27)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[1][6]=a;
					 		B27.setText(String.valueOf(a));			}
					 if (e.getSource()==B28)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[1][7]=a;
						   B28.setText(String.valueOf(a));			}
					if (e.getSource()==B31)
						{
							a++;
							if (a>9)
							a=1;			Matriz[2][0]=a;
							B31.setText(String.valueOf(a));			}
					if (e.getSource()==B32)
						{
							a++;
							if (a>9)
							a=1;			Matriz[2][1]=a;
							B32.setText(String.valueOf(a));			}
					 if (e.getSource()==B33)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[2][2]=a;
					 		B33.setText(String.valueOf(a));			}
					 if (e.getSource()==B35)
						{
							a++;
							if (a>9)
							a=1;			Matriz[2][4]=a;
							B35.setText(String.valueOf(a));			}
					if (e.getSource()==B36)
						{
							a++;
							if (a>9)
							a=1;			Matriz[2][5]=a;
							B36.setText(String.valueOf(a));			}
					 if (e.getSource()==B37)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[2][6]=a;
					 		B37.setText(String.valueOf(a));			}
					 if (e.getSource()==B38)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[2][7]=a;
						   B38.setText(String.valueOf(a));			}
					if (e.getSource()==B39)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[2][8]=a;
						   B39.setText(String.valueOf(a));			}
					if (e.getSource()==B41)
						{
							a++;
							if (a>9)
							a=1;			Matriz[3][0]=a;
							B41.setText(String.valueOf(a));			}
					if (e.getSource()==B43)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[3][2]=a;
					 		B43.setText(String.valueOf(a));			}
					 if (e.getSource()==B44)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[3][3]=a;
						   	B44.setText(String.valueOf(a));			}
					if (e.getSource()==B45)
						{
							a++;
							if (a>9)
							a=1;			Matriz[3][4]=a;
							B45.setText(String.valueOf(a));			}
					if (e.getSource()==B46)
						{
							a++;
							if (a>9)
							a=1;			Matriz[3][5]=a;
							B46.setText(String.valueOf(a));			}
					if (e.getSource()==B48)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[3][7]=a;
						   	B48.setText(String.valueOf(a));			}
					if (e.getSource()==B49)
						{
							a++;
						    if (a>9)
						    a=1;
						    Matriz[3][8]=a;
						   B49.setText(String.valueOf(a));			}
					if (e.getSource()==B51)
						{
							a++;
							if (a>9)
							a=1;			Matriz[4][0]=a;
							B51.setText(String.valueOf(a));			}
					if (e.getSource()==B52)
						{
							a++;
							if (a>9)
							a=1;			Matriz[4][1]=a;
							B52.setText(String.valueOf(a));			}
					 if (e.getSource()==B53)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[4][2]=a;
					 		B53.setText(String.valueOf(a));			}
					 if (e.getSource()==B54)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[4][3]=a;
						   	B54.setText(String.valueOf(a));			}
					if (e.getSource()==B57)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[4][6]=a;
					 		B57.setText(String.valueOf(a));			}
					 if (e.getSource()==B58)
						{
							a++;
						    if (a>9)
						    a=0;			Matriz[4][7]=a;
						   B58.setText(String.valueOf(a));			}
					if (e.getSource()==B59)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[4][8]=a;
						   	B59.setText(String.valueOf(a));			}
					if (e.getSource()==B61)
						{
							a++;
							if (a>9)
							a=1;			Matriz[5][0]=a;
							B61.setText(String.valueOf(a));			}
					if (e.getSource()==B62)
						{
							a++;
							if (a>9)
							a=1;			Matriz[5][1]=a;
							B62.setText(String.valueOf(a));			}
					 if (e.getSource()==B63)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[5][2]=a;
					 		B63.setText(String.valueOf(a));			}
					 if (e.getSource()==B66)
						{
							a++;
							if (a>9)
							 a=1;			Matriz[5][5]=a;
							B66.setText(String.valueOf(a));			}
					 if (e.getSource()==B67)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[5][6]=a;
					 		B67.setText(String.valueOf(a));			}
					 if (e.getSource()==B68)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[5][7]=a;
						   	B68.setText(String.valueOf(a));			}
					if (e.getSource()==B72)
						{
							a++;
							if (a>9)
							a=1;			Matriz[6][1]=a;
							B72.setText(String.valueOf(a));			}
					 if (e.getSource()==B73)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[6][2]=a;
					 		B73.setText(String.valueOf(a));			}
					 if (e.getSource()==B74)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[6][3]=a;
						   	B74.setText(String.valueOf(a));			}
					if (e.getSource()==B75)
						{
							a++;
							if (a>9)
							a=1;			Matriz[6][4]=a;
							B75.setText(String.valueOf(a));			}
					if (e.getSource()==B76)
						{
							a++;
							if (a>9)
							a=1;			Matriz[6][5]=a;
							B76.setText(String.valueOf(a));			}
				    if (e.getSource()==B78)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[6][7]=a;
						   	B78.setText(String.valueOf(a));			}
					if (e.getSource()==B79)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[6][8]=a;
						   	B79.setText(String.valueOf(a));			}
					if (e.getSource()==B82)
						{
							a++;
							if (a>9)
							a=1;			Matriz[7][1]=a;
							B82.setText(String.valueOf(a));			}
					 if (e.getSource()==B84)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[7][3]=a;
						   	B84.setText(String.valueOf(a));			}
					if (e.getSource()==B85)
						{
							a++;
							if (a>9)
							a=1;			Matriz[7][4]=a;
							B85.setText(String.valueOf(a));			}
					if (e.getSource()==B87)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[7][6]=a;
					 		B87.setText(String.valueOf(a));			}
					 if (e.getSource()==B88)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[7][7]=a;
						   	B88.setText(String.valueOf(a));			}
					if (e.getSource()==B89)
						{
							a++;
						    if (a>9)
						    a=1;			Matriz[7][8]=a;
						   	B89.setText(String.valueOf(a));			}
                    if (e.getSource()==B92)
						{
							a++;
							if (a>9)
							a=1;			Matriz[8][1]=a;
							B92.setText(String.valueOf(a));			}
					 if (e.getSource()==B93)
						{
							a++;
							if (a>9)
					 		a=1;			Matriz[8][2]=a;
					 		B93.setText(String.valueOf(a));			}
					 if (e.getSource()==B94)
						{
								a++;
						    	if (a>9)
						    	a=1;		Matriz[8][3]=a;
						   		B94.setText(String.valueOf(a));		}
					if (e.getSource()==B95)
						{
								a++;
								if (a>9)
							 	a=1;		Matriz[8][4]=a;
								B95.setText(String.valueOf(a));		}
					if (e.getSource()==B96)
						{		a++;
								if (a>9)
							 	a=1;			Matriz[8][5]=a;
							 	B96.setText(String.valueOf(a));		}
					 if (e.getSource()==B97)
						{		a++;
								if (a>9)
					 		 	a=1;		Matriz[8][6]=a;
					 			B97.setText(String.valueOf(a));		}
					}
}