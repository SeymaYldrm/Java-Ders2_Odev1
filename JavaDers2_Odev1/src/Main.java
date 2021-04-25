public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		User user1 = new User(1,"Şeyma","Yıldırım","seyma@gmail.com","12345");
		
		User user2 = new User();
		user2.userId = 2;
		user2.name = "Neslihan";
		user2.lastName = "Yıldırım";
		user2.mail = "nesli@gmail.com";
		user2.password = "12345";
		
		User[] users = {user1, user2};
		
		for (User user : users) {
			System.out.println(user.name);
		}
		
		Course course1 = new Course();
		course1.id = 1;
		course1.courseName = "Angular";
		course1.detail = "Yazılım Geliştirici Yetiştime Kursu";
		course1.educatorName = "Engin Demirog";
		
		Course course2 = new Course();
		course2.id = 2;
		course2.courseName = "Java";
		course2.detail = "Yazılım Geliştirici Yetiştime Kursu";
		course2.educatorName = "Engin Demirog";
		
		UserManager userManager = new UserManager();
		userManager.addUser(user1);
		userManager.addUser(user2);
		userManager.deleteUser(user1);
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(course1);
		courseManager.addCourse(course2);
	}

}
