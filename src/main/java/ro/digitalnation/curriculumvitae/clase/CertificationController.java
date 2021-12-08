package ro.digitalnation.curriculumvitae.clase;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "/certification")
public class CertificationController {
	
	private final CertificationService certificationService;

	@Autowired
	public CertificationController(CertificationService certificationService) {
		this.certificationService = certificationService;
	}

	@GetMapping
	public List<Certification> getCertification() {
		return certificationService.getCertification();
	}
}
