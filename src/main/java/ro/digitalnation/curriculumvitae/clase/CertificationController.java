package ro.digitalnation.curriculumvitae.clase;

import java.time.LocalDate;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

	@PostMapping
	public void registerNewCertification(@RequestBody Certification certification) {
		certificationService.addNewCertification(certification);
	}

	@DeleteMapping(path = "{certificationId}")
	public void deleteCertification(@PathVariable("certificationId") Long certificationId) {
		certificationService.deleteCertification(certificationId);
	}

	@PutMapping(path = "{certificationId}")
	public void updateCertification(@PathVariable("certificationId") Long certificationId,
			@RequestParam(required = false) String competence, @RequestParam(required = false) String organization,
			@RequestParam(required = false) LocalDate attainedDate) {
		certificationService.updateCertification(certificationId, competence, organization, attainedDate);
	}

}
