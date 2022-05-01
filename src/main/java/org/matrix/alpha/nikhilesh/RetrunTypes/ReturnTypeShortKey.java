package org.matrix.alpha.nikhilesh.RetrunTypes;

public class ReturnTypeShortKey {
            public NewEmployee EmpData(){
            // NewEmployee em=new NewEmployee();
            return new NewEmployee(); // This Is Directly Obj Creation on Another-Class
        }

        public static void main(String[] args) {
            ReturnTypeShortKey rts=new ReturnTypeShortKey();
            NewEmployee abc=rts.EmpData();
            System.out.println(abc.empName);
            System.out.println(abc.empId);
            System.out.println(abc.comName);
        }
    }
