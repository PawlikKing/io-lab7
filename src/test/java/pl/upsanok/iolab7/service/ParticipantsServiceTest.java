package pl.upsanok.iolab7.service;

import java.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.upsanok.iolab7.UserDto;

class ParticipantsServiceTest {

    private ParticipantsService participantsService;

    @BeforeEach
    public void setUp() {
        List<String> participants = List.of("Jan", "Kuba", "Marek", "Ania", "Beata", "Cecylia");
        participantsService = new ParticipantsService(participants);
    }

    @Test
    public void shouldCorrectlyMapAllParticipants() {
        //given
        List<UserDto> expectedParticipants = List.of(
                new UserDto("Jan"),
                new UserDto("Kuba"),
                new UserDto("Marek"),
                new UserDto("Ania"),
                new UserDto("Beata"),
                new UserDto("Cecylia")
        );

        //when
        List<UserDto> participants = participantsService.getParticipants();

        //then
        Assertions.assertEquals(expectedParticipants, participants);
    }
}