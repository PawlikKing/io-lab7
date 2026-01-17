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
    goodPeople=participants.stream().map(participant->new UserDto(participant)).toList();
    return goodPeople;
  }
}
