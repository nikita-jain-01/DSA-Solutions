// https://www.geeksforgeeks.org/problems/lcm-and-gcd4516/1
// Euclidean's Algorithm

package dsa.preparation.basicmath.striver;

public class LcmAndHcf {
    static Long[] lcmAndGcd(Long A , Long B) {
        Long gcd, lcm, temp, lcmA=A, lcmB=B;
        if(B>A) {
            temp=A;
            A=B;
            B=temp;
        }
        while(B!=0) {
            gcd=A%B;
            A=B;
            B=gcd;
        }
        lcm=A;
        lcmA=lcmA/A;
        lcmB=lcmB/A;
        return new Long[]{lcm*lcmA*lcmB, A};
    }
}
