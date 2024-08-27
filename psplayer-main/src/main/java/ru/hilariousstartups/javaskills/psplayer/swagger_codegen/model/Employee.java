/*
 * OpenAPI definition
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package ru.hilariousstartups.javaskills.psplayer.swagger_codegen.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
/**
 * Кассир. Работать может не больше 8 часов подряд, после смены должен отдыхать 16 часов.Сотрудник имеет показатель опыта от 10% до 100%. Чем больше опыт, тем быстрее он обслуживает клиента, но тем больше получает ЗП.Возможные вариант и зарплаты доступны в разделе RecruitmentAgency. Зарплата расчитывается с округлением до часа в пользу сотрудника. Сотрудника нельзя уволить пока он не отдохнул после смены и пока он на смене.
 */
@Schema(description = "Кассир. Работать может не больше 8 часов подряд, после смены должен отдыхать 16 часов.Сотрудник имеет показатель опыта от 10% до 100%. Чем больше опыт, тем быстрее он обслуживает клиента, но тем больше получает ЗП.Возможные вариант и зарплаты доступны в разделе RecruitmentAgency. Зарплата расчитывается с округлением до часа в пользу сотрудника. Сотрудника нельзя уволить пока он не отдохнул после смены и пока он на смене.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2021-08-29T20:10:20.018547+03:00[Europe/Moscow]")
public class Employee {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("experience")
  private Integer experience = null;

  @SerializedName("salary")
  private Integer salary = null;

  public Employee id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Табельный номер сотрудника
   * @return id
  **/
  @Schema(description = "Табельный номер сотрудника")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Employee firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

   /**
   * Имя сотрудника
   * @return firstName
  **/
  @Schema(description = "Имя сотрудника")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Employee lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

   /**
   * Имя сотрудника
   * @return lastName
  **/
  @Schema(description = "Имя сотрудника")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Employee experience(Integer experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Опыт сотрудника
   * @return experience
  **/
  @Schema(description = "Опыт сотрудника")
  public Integer getExperience() {
    return experience;
  }

  public void setExperience(Integer experience) {
    this.experience = experience;
  }

  public Employee salary(Integer salary) {
    this.salary = salary;
    return this;
  }

   /**
   * Зарплата сотрудника в час
   * @return salary
  **/
  @Schema(description = "Зарплата сотрудника в час")
  public Integer getSalary() {
    return salary;
  }

  public void setSalary(Integer salary) {
    this.salary = salary;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Employee employee = (Employee) o;
    return Objects.equals(this.id, employee.id) &&
        Objects.equals(this.firstName, employee.firstName) &&
        Objects.equals(this.lastName, employee.lastName) &&
        Objects.equals(this.experience, employee.experience) &&
        Objects.equals(this.salary, employee.salary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, experience, salary);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Employee {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    salary: ").append(toIndentedString(salary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
