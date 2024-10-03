package Bank.Application.Mini_Bank.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Bank.Application.Mini_Bank.Model.Branch;
import Bank.Application.Mini_Bank.Repository.BranchRepository;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchRepository branchRepository;

    public Branch saveBranch(Branch branch) {
        return branchRepository.save(branch);
    }

    public List<Branch> getAllBranches() {
        return branchRepository.findAll();
    }

    public Branch getBranchById(Long id) {
        return branchRepository.findById(id).orElse(null);
    }

    public void deleteBranch(Long id) {
        branchRepository.deleteById(id);
    }

    public Branch updateBranch(Long id, Branch updatedBranch) {
        Branch branch = branchRepository.findById(id).orElse(null);
        if (branch != null) {
            branch.setName(updatedBranch.getName());
            branch.setAddress(updatedBranch.getAddress());
            return branchRepository.save(branch);
        }
        return null;
    }
}
