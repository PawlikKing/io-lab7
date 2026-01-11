package pl.upsanok.iolab7;

import java.util.Objects;

public class UserDto {
  private String name;

  public UserDto(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return "UserDto{" +
           "name='" + name + '\'' +
           '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDto userDto = (UserDto) o;
    return Objects.equals(name, userDto.name);
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(name);
  }
}

