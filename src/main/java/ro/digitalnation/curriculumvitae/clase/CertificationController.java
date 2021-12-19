package ro.digitalnation.curriculumvitae.clase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CertificationController {

	private final CertificationService certificationService;

	@Autowired
	public CertificationController(CertificationService certificationService) {
		super();
		this.certificationService = certificationService;
	}
	
	// TABLE
		@GetMapping("/certification")
		public String listCertification(Model model) {
			model.addAttribute("listCertifications", certificationService.getCertification());
			return "certification";
		}
		
		// ADD TEMPLATE
		@GetMapping("/certification/new")
		public String createCertificationForm(Model model) {
			Certification newCertification = new Certification();
			model.addAttribute("newCertification", newCertification);
			return "addCertification";
		}

		// ADD
		@PostMapping("/certification/add")
		public String registerNewCertification(@ModelAttribute("addCertification") Certification addCertification) {
			certificationService.addNewCertification(addCertification);
			return "redirect:/certification";
		}

		// UPDATE
		@GetMapping("/certification/update/{id}")
		public String updateCertification(@PathVariable(value = "id") long id, Model model) {
			Certification showCertification = certificationService.getCertificationById(id);
			model.addAttribute("updateCertification", showCertification);
			return "updateCertification";
		}

		// DELETE
		@GetMapping("/certification/delete/{id}")
		public String deleteCertificationFromTable(@PathVariable("id") Long certificationId) {
			certificationService.deleteCertification(certificationId);
			return "redirect:/certification";
		}

	/*@GetMapping
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
	}*/

}
