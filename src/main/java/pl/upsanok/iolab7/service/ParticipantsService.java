package pl.upsanok.iolab7.service;

import java.util.ArrayList;
import java.util.List;
import pl.upsanok.iolab7.UserDto;

public class ParticipantsService {
  private List<String> participants;

  public ParticipantsService(List<String> participants) {
    this.participants = participants;
  }

  public List<UserDto> getParticipants() {
    List<UserDto> goodPeople = new ArrayList<>();
    for (int i = 0; i < participants.size(); i++) {
      String participant = participants.get(i);
      UserDto userDto = new UserDto(participant);
      goodPeople.add(userDto);
    }
    return goodPeople;
  }
}
