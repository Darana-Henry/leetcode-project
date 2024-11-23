//https://leetcode.com/problems/defanging-an-ip-address/
package algorithms.easy.d;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        DefangingAnIPAddress ip = new DefangingAnIPAddress();
        System.out.println("Output:\t" + ip.defangIPaddr("1.1.1.1"));
        System.out.println("Output:\t" + ip.defangIPaddr("255.100.50.0"));
    }

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
