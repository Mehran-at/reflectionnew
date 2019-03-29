//package at.nacs.drhoustwo;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.web.client.RestTemplate;
//
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
//
//class PatientEndpointTest {
//
//    @Autowired
//    TestRestTemplate testRestTemplate;
//    String url = "/patients";
//
//    @MockBean
//    RestTemplate restTemplate;
//
//    @MockBean
//    DiognoseClient client;
//
//    @Test
//    void getName() {
//        Patient patient = Patient.builder().name("Ashkan").symptoms("Alzimer").build();
//        Patient actual = testRestTemplate.postForObject(url, patient, Patient.class);
//
//        Assertions.assertThat(actual.getName().isEqualTo("Ashkan"));
//        Assertions.assertThat(actual.getSymptoms()).isEqualTo("Alzimer");
//    }
//}