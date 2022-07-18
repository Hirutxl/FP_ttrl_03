object Q1Q2Q3{

def areaOFdisk(r:Double):Double=math.Pi*math.pow(r,2);      //Q01
def cTOf(c:Double):Double=c*1.8000 + 32.00                  //Q02
def volOFsphere(r:Double):Double=4/3*math.Pi*math.pow(r,3)  //Q03

def main(args:Array[String]):Int =
    {
        println(areaOFdisk(5.0));
        println(cTOf(35.0));
        println(volOFsphere(5));
        return 0;
    }
}