package project.model;
/*
 Interface
 Để trách phức tạp của đa kế thừa trong OOP, Java sử dụng Interface
 Một class chỉ kế thừa từ một class cha nhưng có thể kế thừa từ nhiều interface
 Interface được khai báo như một lớp với các thuộc tính là các HẰNG
     		các method là các abstract method
 Ta có thể hiểu interface như gói các phương thức hay thuộc tính mà các lớp kế thừa phải tuân theo
hay gói các luật do method trong interface mặc định là các abstract method
 */
public interface IHocTap {
	public void hocToan();
	public void hocVan();
}
