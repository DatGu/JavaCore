package project.model;

public enum XepLoai {
	Gioi ("Giỏi"),
	Kha ("Khá"),
	TrungBinh ("Trung Bình"),
	Yeu ("Yếu");
	
	//Thêm mô tả ví dụ Gioi có mô tả là Giỏi
	private String msg;
	XepLoai (String msg)
	{
		this.msg=msg;
	}
	public String description() {
		return this.msg;
	}
}
