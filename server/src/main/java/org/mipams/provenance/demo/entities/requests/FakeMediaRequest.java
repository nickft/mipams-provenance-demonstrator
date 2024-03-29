package org.mipams.provenance.demo.entities.requests;

import java.util.List;

import org.mipams.provenance.entities.assertions.Assertion;
import org.mipams.provenance.entities.assertions.RedactableAssertion;

import lombok.Getter;
import lombok.Setter;

public class FakeMediaRequest {
    private @Getter @Setter String assetUrl;
    private @Getter @Setter String modifiedAssetUrl;
    private @Getter @Setter List<Assertion> assertionList;
    private @Getter @Setter List<RedactableAssertion> encryptionAssertionList;
    private @Getter @Setter List<RedactableAssertion> encryptionWithAccessRulesAssertionList;
    private @Getter @Setter List<String> redactedAssertionUriList;
    private @Getter @Setter List<String> componentIngredientUriList;
    private @Getter @Setter String outputAssetName;
}
