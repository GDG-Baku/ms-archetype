package az.gdg.msarchetype.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "people", url = "http://localhost:8081/people")
public interface FeignConfiguration {


}
