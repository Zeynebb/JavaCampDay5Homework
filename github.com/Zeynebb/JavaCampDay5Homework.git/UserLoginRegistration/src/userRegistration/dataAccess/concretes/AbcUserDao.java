package userRegistration.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import userRegistration.dataAccess.abstracts.UserDao;
import userRegistration.entities.concretes.User;

public class AbcUserDao implements UserDao {
	private List<String> users=new ArrayList<String>();

	@Override
	public void add(User user) {
		System.out
				.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� veritaban�na kaydedildi.");
	}

	@Override
	public void delete(User user) {
		System.out
				.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c� veritaban�ndan silindi.");
	}

	@Override
	public void update(User user) {
		System.out
				.println(user.getFirstName() + " " + user.getLastName() + " isimli kullan�c�n�n bilgileri g�ncellendi.");
	}

	@Override
	public void addEmail(User user) {
		users.add(user.getEmail());
	}

	@Override
	public List<String> getEmail() {
		return users;
		
	}

}
