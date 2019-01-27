package dtos;

import java.math.BigDecimal;
import java.util.List;

import models.Person;

public class IndexDto {
	/** 名前 */
	public String name;
	/** 金額 */
	public BigDecimal amount;
	/** 削除ID */
	public Long id;
	/** データリスト */
	public List<Person> personList;
}
