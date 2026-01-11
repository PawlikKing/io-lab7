package pl.upsanok.iolab7;

import java.util.ArrayList;
import java.util.List;

public class ParticipantsService {
  private List<String> participants;

  public ParticipantsService(List<String> participants) {
    this.participants = participants;
  }

  public List<UserDto> getParticipants() {
    List<UserDto> goodPeople = new ArrayList<>();
    for (int i = 0; i < participants.size(); i++) {
      String participant = participants.get(0);
      UserDto userDto = new UserDto(participant);
      goodPeople.add(userDto);
    }

    return goodPeople;
  }
}
