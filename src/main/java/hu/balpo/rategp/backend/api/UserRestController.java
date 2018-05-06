package hu.balpo.rategp.backend.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hu.balpo.rategp.backend.model.ApiResponse;

@RestController
@RequestMapping("/api/login")
public class UserRestController {
	
	@PostMapping
	public ApiResponse getUser() {
		return new ApiResponse(200,"LOGIN","SUCCESS");
	}
}
