public class TriangleClassifier {
    static String triangleClassify(int a, int b, int c){
        if (a<=0 || b<=0 || c<=0){
            return "Khong phai tam giac";
        }else if (a==b && b==c && a==c){
            return "Tam giac deu";
        }else if (a==b || b==c || a==c){
            return "Tam giac can";
        }else if ((a+b)>c && (a+c)>b && (b+c)>a){
            return "Tam giac thuong";
        }else return "Khong phai tam giac";
    }
}
