package cryptography;

import java.util.Scanner;

public class SteamCipher {
    int aa=65,bb=66,cc=67,dd=68,ee=69;
    int ff=70,gg=71,hh=72,ii=73,jj=74;
    int kk=75,ll=76,mm=77,nn=78,oo=79;
    int pp=80,qq=81,rr=82,ss=83,tt=84;
    int uu=85,vv=86,ww=87,xx=88,yy=89,zz=90;
    Scanner kb=new Scanner(System.in);
    void encryption()
    {
        System.out.print("Enter your message:");
        String s=kb.next();
        char a=s.charAt(0);
        char b=s.charAt(1);
        char c=s.charAt(2);
        char d=s.charAt(3);
        char e=s.charAt(4);
        for(int i=65;i<=122;i++)
        {
            char ch;
            ch=(char)i;
            if(ch==a){
                if(i==aa){
                    a=1;
                    System.out.print(a);
                }

            } else if (ch==b){
            if(i==bb){
                b=0;
                System.out.print(b);
                }
            } else if (ch==c){
                if(i==cc){
                    c=1;
                    System.out.print(c);
                }else if (ch==d){
                    if(i==dd){
                        d=0;
                        System.out.print(d);
                    }else if (ch==e){
                        if(i==ee){
                            e=1;
                            System.out.print(e);
                        }
                    }
                }
            }


        }


    }
    void decryption()
    {

    }
}
