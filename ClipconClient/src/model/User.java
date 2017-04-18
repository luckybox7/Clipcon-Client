package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class User {
	private String eMail;
	private String nickName;
	private AdressBook adressBook; // �ּҷ�
	private Group group;
}
