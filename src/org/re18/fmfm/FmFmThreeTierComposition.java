package org.re18.fmfm;

import org.re18.generic.Component;
import org.re18.generic.KnowledgeBase;
import org.re18.generic.Requirement;
import org.re18.generic.ThreeTierComposition;

import java.util.HashSet;
import java.util.Set;

public class FmFmThreeTierComposition implements ThreeTierComposition {


    @Override
    public Set<Component> RequirementsDriven(Set<Component> available, Set<Requirement> requirements) {
        Set<Component> comp=new HashSet<>();
        return  comp;
    }

    @Override
    public Set<Component> Alternatives(Set<Component> available, Set<Requirement> requirements, KnowledgeBase kb) {
        Set<Component> comp=new HashSet<>();
        return  comp;
    }

    @Override
    public Set<Component> ResourceDriven(Set<Component> available, Set<Requirement> requirements, KnowledgeBase kb) {
        Set<Component> comp=new HashSet<>();
        return  comp;
    }

}
